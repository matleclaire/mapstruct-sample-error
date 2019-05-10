# Mapstruct issue demo

The project purpose is only to demonstrate an issue with Mapstruct version 1.3.0-Final.

Using `Mappers.getMapper(Class clazz)` is throwing a `ClassNotFoundException` when a mapper is defined with a custom implementation name.


See **DemoApplicationTest** to reproduce the issue.