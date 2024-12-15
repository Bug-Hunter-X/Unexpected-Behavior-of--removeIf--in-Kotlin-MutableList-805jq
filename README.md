# Unexpected Behavior of `removeIf` in Kotlin MutableList

This repository demonstrates a subtle issue with the `removeIf` function when used with a `MutableList` in Kotlin.  The problem arises when adding new elements to the list *after* calling `removeIf`, but *before* the `removeIf` has completed its work. Because `removeIf` iterates through the original state of the list, any elements added during the `removeIf` operation will not be affected.

## Code Example

The `bug.kt` file contains the Kotlin code illustrating the unexpected behavior. The `bugSolution.kt` provides a possible solution.

## Reproduction

1. Clone this repository.
2. Run `bug.kt` using a Kotlin compiler.
3. Observe the unexpected output.

## Solution

The `bugSolution.kt` file showcases a more robust approach to remove elements from a list, addressing the unexpected behavior of adding elements during `removeIf`. It uses an iterator to safely remove elements while handling potential concurrent modifications.