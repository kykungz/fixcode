`
# fixcode
## Case: 1
* For `testPersonEquals(Person a, Person b)` method,
  - Person `a` and `b` have a different name, "Cat" and "Mouse", so the output is `false`.
* For `testObjectEquals(Object a, Object b)` method,
  - It is getting Object as parameters, so when `a.equals(b)` is called, it couldn't find a method in Person class that had Object as a parameter, so it called the default Object's equals method and returned `false`. Although the right answer is `false`, it has a different meaning.

## Case: 2
* For `testPersonEquals(Person a, Person b)` method,
  - Person `a` and `b` have a same name, "Cat" and "Cat", so the output is `true`.
* For `testObjectEquals(Object a, Object b)` method,
  - Likewise, it couldn't find a method in Person class that had Object as a parameter, so it called the default Object's equals method and returned `false` while it should be `true`

## Case: 3
* `a.equals(c)`
  - output `true` because it calls method `equals(Person other)` in Person class and `c` is Student which is a sub-class of Person, so this method is being invoked.
  The `equals(Person other)` method only checks for the `name` of the Person so this returned `true`.
  - The right answer should be `false` because `a` is Person and `b` is Student, which are different classes, and shouldn't be comparable.
* `c.equals(a)`
  - output `true` because it calls method `equals(Person other)` in Person which is its super-class, and only checks for the `name` variable.
  - Likewise, it should return `false` because different classes shouldn't comparable.
