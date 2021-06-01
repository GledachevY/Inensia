function showAllChildren(element){
    const children = element.childNodes;

    // Adding the parent element to the collection.
    const resultArr = []
    children.forEach(el => {
        resultArr.push(el);
    });
    resultArr.push(element);
    
    return resultArr;
}

