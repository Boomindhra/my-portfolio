let a,b,c,d;
a= prompt("enter a");
a=Number(a)
b= prompt("enter b");
c= prompt("enter c");
b=Number(b)
c=Number(c)
console.log(sum(a,b,c));
function sum(...numbers){
    let total =0;
    for(let i of numbers)
    {
        total+=i;
    }
    return total
}