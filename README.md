# Message Checker — Chat App

<img width="500" height="400" alt="outcome" src="https://github.com/user-attachments/assets/1f8b241d-1c6c-4869-873e-650d013a4848" />


A personal learning project to practice Kotlin and Jetpack Compose by building
a simple chat-style app, step by step, connecting new concepts to real code.

## What this app does

- **Chat list screen**: shows past conversations, with a "Compose" button to
  start a new one.
- **Chat screen**: type a message, send it, and get an echoed reply — shown
  like a real chat, with bubbles, timestamps, and a top bar with the name of
  who you're texting.
- Tapping back on the chat screen returns to the chat list, where that
  conversation is saved and can be reopened.

## Why this project exists

To practice everything learned so far (variables, data types, conditionals,
functions, data structures, input/output, null safety) inside a real app,
and to learn Jetpack Compose fundamentals (state, navigation, layouts) by
building something with a real user-facing goal instead of isolated
exercises.

## Concepts this project is expected to teach

- Jetpack Compose navigation (`NavController`, multiple screens)
- Managing state across screens
- Working with lists of objects (conversations, messages)
- Reusing and composing UI components
- Timestamps / formatting data for display

## Scope for v1 (keep it small)

- No real backend, no real AI — replies are a simple canned/echo response.
- No persistence beyond the app being open (conversations reset on app
  restart) — this can be a future upgrade.
- Focus is on learning, not on shipping a polished product.

## Out of scope for now (future ideas, not v1)

- Saving chats permanently (a database)
- Real AI-generated responses
- Multiple real contacts / users


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
