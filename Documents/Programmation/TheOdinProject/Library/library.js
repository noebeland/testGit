const titleInput = document.getElementById("titleInput");
const authorInput = document.getElementById("authorInput");
const pagesIntput = document.getElementById("pagesInput");
const readStatusInput = document.getElementById("readStatusInput");
const popupButton = document.querySelector(".button-primary popup-button");
const formContainer = document.querySelector(".form-container");


let bookArray = [];

function Book(author, title, pages, read){
    this.author = author;
    this.title = title;
    this.pages = pages;
    this.read = read;
    
}
function toggleForm(){
    popupButton.classList.toggle("opened");
    popupButton.innerHTML == "Add New Book" ? popupButton.innerHTML = "<i class = 'little-heart'></i> Close": popupButton.innerHTML = "Add New Book";
    formContainer.classList.toggle("show");
}
function addBookToLibrary(){
    if(titleInput.value !== "" && authorInput !== "" && pagesIntput > 0 && !NaN(pagesIntput.value) && readStatusInput.value !== ""){
        let newBook = new Book(authorInput.value, titleInput.value, pagesIntput.value, readStatusInput.value);
        bookArray.push(newBook);
    }

}