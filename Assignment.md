## The Game of Nim

Section 3.11 Project (pages 58 - 59)

The game of Nim is played as follows. You have *n* toothpicks to choose from.
Player 1 can remove 1, 2, 0r 3 toothpicks. Player 2 can then remove 1, 2, or 3
toothpicks. This process repeats, alternating between players 1 and 2, until
there are no more toothpicks left. **The player who removes the last toothpick
is the loser**. Assume that one of the players is *human* and the other player
is the *computer*.

### Game Play:
1. Use a random generator to decide who goes first.
2. The player who goes second should choose *n*. The number of toothpicks should
be bigger than 20 and smaller than 30.
3. Each player chooses 1,2, or 3 toothpicks, until the last toothpick is removed.

### Presentation to the user:
1. Remember to print the remaining number of toothpicks on the screen after every
move.
2. After the last toothpick is removed print "You Win" or "You Lose".

### Error checking
1. You can assume that the inputs are of a valid type. For instance, when asking
for the number of toothpicks, you can assume that the user is going to enter an
integer.

2. When the user gets to choose the number of toothpicks, you should continuously
ask the user for a number in the valid range, until it is given.

3. The same goes for choosing 1,2, or 3 toothpicks. The user should be asked,
until a valid input is given.

### Examples of Game Play
There are examples of how the game plays in your book. 
