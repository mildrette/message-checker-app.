# message-checker-app.
A simple Android app built with Jetpack Compose to check SMS message length, built while learning Kotlin fundamentals.

## What it does today on day 1 of working on this app 

Checks whether a typed message fits within a 160-character SMS limit, and shows how many characters are left as you type.

## Concepts practiced so far

- **State** — `remember { mutableStateOf(...) }` to hold and track the typed message
- **Input** — `OutlinedTextField` with `value` / `onValueChange` to capture what the user types
- **Functions & return values** — `characterLeft()` calculates `160 - messageLength` and returns the result
- **String templates** — `${}` to insert a calculated value into displayed text

## Next steps

- Add a "Save message" button with conditional logic (mark messages as ok or too long)
- Store saved messages in a list
- Add null safety for showing the last saved draft
