# Build Checklist — Message Checker Chat App

Check items off as you go. Small steps on purpose — don't skip ahead.

## Step 1 — Navigation basics
- [ ] Create a second, blank screen (Composable function)
- [ ] Add a button on screen 1 that navigates to screen 2
- [ ] Add a back button on screen 2 that returns to screen 1
- [ ] Confirm you understand what `NavController` and `NavHost` are doing

## Step 2 — Move existing chat UI into screen 2
- [ ] Move text input + send button into the chat screen
- [ ] Reconnect the echo-reply logic you already built
- [ ] Confirm messages still show up as before, now on the new screen

## Step 3 — Make it look like a chat
- [ ] Style your message and bot's message differently (e.g. left vs right)
- [ ] Add a timestamp under each message
- [ ] Add a top bar with a name and back button

## Step 4 — Chat list screen
- [ ] Design a simple row layout for one saved conversation
- [ ] Add a "Compose" button that starts a new chat
- [ ] Connect it: opening a chat from the list should load that conversation

## Step 5 — Save conversations (hardest part — do last)
- [ ] Store each conversation as its own list of messages
- [ ] Keep a list of all conversations on the home screen
- [ ] New messages update the correct conversation

## Stretch goals (only after v1 works)
- [ ] Persist chats so they survive app restart
- [ ] Replace canned reply with something smarter
- [ ] Polish visuals (avatars, colors, spacing)

---
### How to use this checklist
- Tackle one step at a time — don't start step 2 before step 1 works.
- If you get stuck, try docs/Stack Overflow first, then ask for help on the
  specific concept you're stuck on (not the whole step).
- Commit to GitHub after each checked box, or at least after each full step,
  so your progress is tracked.