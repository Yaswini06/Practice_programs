var Foo = /** @class */ (function () {
    function Foo() {
    }
    Foo.prototype.getFullName = function () {
        return this.firstName + this.lastName;
    };
    return Foo;
}());
var aPerson = new Foo();

var someObj = {
    // firstName: 'text',
    lastName: "text",
    middleName: "text",
    getFullName: function () { return "test"; }
};
aPerson = someObj;