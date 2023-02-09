function last<a>(arr: a[]){
    const num = arr.length -1;
    return arr[num];
}

function prepend<a>(arr: a[], b:a){
    arr.unshift(b);
    return arr;
}
