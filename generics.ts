import {Person} from './class-demo';

function echo<T>(args: T): T {
    return args;
}
// console.log(echo(2));
var myVariable = echo(23);



class Admin extends Person{}
class Manager extends Person{}

let admin = new Admin("mon","day");
let manager = new Manager("good","morning");

function personEcho<T extends Person>(person: T): T{
    return person;
}
var foo = personEcho(admin);