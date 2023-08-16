
function handleRadioClick(id) {
  console.log('id---',id);
  if (id == "price") {
    box1.style.display = 'block';
    box2.style.display = 'none';
    // console.log("price");
    //document.write("hit the price");
  } else{
     box2.style.display = 'block';
    box1.style.display = 'none';
    //  console.log("quantity");
   }
  
}
