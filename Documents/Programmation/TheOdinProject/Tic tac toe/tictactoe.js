const gameBoard = (() => {
    const initArray = ['', '', '', '', '', '', '', '', ''];
    const initBoard = () => document.querySelectorAll('.game').forEach(elt => {
        elt.innerHTML = '';
        elt.classList.remove('clicked');
    });
    return{
        initBoard
    }; 
})();


const game = (() =>{
    const winning = [['1', '2', '3'],
                    ['4', '5', '6'],
                    ['7', '8', '9'],
                    ['1', '4', '7'],
                    ['2', '5', '8'],
                    ['3', '6', '9'],
                    ['1', '5', '9']];

    let stepCount = 0;
    const getStepCounts = () => stepCount;
    const recordGame = (position) => stepCount++;
    const checkGame = (player) =>{
        return winning.some(comb => comb.every(elt => player.getPlayerSteps().includes(elt)));
    }

    const resetGame = () => stepCount = 0;
    return{
        recordGame,
        getStepCounts,
        checkGame,
        resetGame
    };
})();


const Player = (marker) => {
    let playerSteps = [];
    const getPlayerSteps = () => playerSteps;
    const addSteps = (position) => playerSteps.push(position);
    const resetPlayer = () => playerSteps = [];
    return{
        addSteps,
        getPlayerSteps,
        resetPlayer,
        marker
    };
};



const player1 = Player('x');
const player2 = Player('o');

document.addEventListener('click', function(event){
    if(event.target.id == "start-button"){
        document.querySelectorAll('.game').forEach(elt => elt.classList.remove('disabled'));
        gameBoard.initBoard();
        player1.resetPlayer();
        player2.resetPlayer();
        game.resetGame();
    }

    if((game.getStepCounts() < 10) && (event.target.className == "game")){
        let position = event.target.id;
        game.recordGame();
        
        if(game.getStepCounts() % 2){
            event.target.innerHTML = 'x';
            event.target.classList.add('clicked');
            player1.addSteps(position);

            if(game.checkGame(player1)){
                setTimeout(function(){
                    alert("Player x won the game!");
                    gameBoard.initBoard();
                    player1.resetPlayer();
                    player2.resetPlayer();
                    game.resetGame();
                }, 500);
            }

        }else{
            event.target.innerHTML = 'o';
            event.target.classList.add('clicked');
            player2.addSteps(position);
            if(game.checkGame(player2)){
                setTimeout(function(){
                    alert("Player o won the game!");
                    gameBoard.initBoard();
                    player1.resetPlayer();
                    player2.resetPlayer();
                    game.resetGame();
                }, 500);
        }
    }

    if(player1.getPlayerSteps().length + player2.getPlayerSteps().length == 9){
        setTimeout(function(){
            alert("Tie!");
            gameBoard.initBoard();
            player1.resetPlayer();
            player2.resetPlayer();
            game.resetGame();
        }, 500);
    }
}
});