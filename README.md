# Groovy Implicit Type Coercion Bug
This repository demonstrates a potential pitfall in Groovy's implicit type coercion. The `myMethod` function attempts to handle various input types, but the use of `toString()` can throw a `NumberFormatException` if the input object doesn't have a suitable implementation.

The `bug.groovy` file contains the buggy code.  The `bugSolution.groovy` file offers a more robust solution.

This example highlights the need for explicit type checking and handling in Groovy to prevent unexpected runtime exceptions.