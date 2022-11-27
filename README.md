# practice-java-core

Part of my daily plan for studying Java.

# Ideas

## TUI

* Rock Paper Scissor with n (odd) rounds

---

* Tic Tac Toe of n * n

```bash
    |   |
----+---+----
    |   |
----+---+----
    |   |
```

---

* Hangman

```bash
+------+
|      |
|     ( )
|     /|\
|    / | \
|      |
|     / \  
|    /   \
|
|___
```

---

## Networking

* File Copy over network -> I/O and network

---

# Java Pros and Cons (These are my personal opinion and will change as I learn more or experience other paradigms)

* 

## Note: Some critique can easily be solved by using different libraries and using a more extensive

## Pros

1.  

## Cons

0. Not at all beginner friendly. There should be some abstract layer where I could at least print "Hello world" without having to write `public static void main(String[] args)`
1. A lot, like a lot of boilerplate code. Like when I started learning it there was not even `jshell` so to test even some fundamental concept you have to write a test class.
2. Some implicit type conversion could have been nice like

```java
public String toString() {
    return 1; // will give error as Java will not convert int to String implicitly. TODO: research why Java made this trade-off
}
```

3. I am going to contradict my last point by saying that Java should be more strongly typed.
    (i) As seen in my GSoC period, the problem of Java and NullPointerException is really a mess.
    (ii) Checker Framework solves this issue to much extent. But integrating it to legacy code is still a pain.

4. `String.char()` produces `IntStream`, as there is no `CharStream`. WTF!!!
    Why not just provide a CharStream which just returns IntStream.mapToObj(c -> (char) c)

---

# IDEs:

* I admire VS Code and its simple yet extensible feature.
  * but when I was starting out Java Extension had a lot of bugs most prominent one was not able to create a
    file without a package. But the arrow buttons on my keyboard are really small, so it makes the navigation painful.
  * Just today I try to auto-indent a code with lambdas, and the result was not pleasing.
* Eclipse: Long time to load and no good dark theme last time I used.
* IntelliJ Idea:
  * Interface was nice but as Guido van Rossum said when comparing PyCharm and Emacs "its like driving a 18 Wheeler truck....", and was too overwhelming.
  * And JetBrains really lining the bottom-line with having a different for every different language!! As a low earning individual I can't really afford that.
  * Was trying to install Fleet, but put off by pre-requisite to install JetBrains ToolBar.
  * Also as a Linux user, I am quite angry that they package it as 'snap' and not 'flatpak'.
* NeoVim:
    I just love its keybindings. Because of this, I started using Vimium in my browser, I have even started using Vim binding on HackerRank and Leetcode(quite a buggy implementation) and couldn't be more happier.
* Emacs: Haha, nice try. Not going down that hole.

### Verdict: 

* Going to use VS-Code initially  and then gradually switch to IntelliJ.
* But I am going to try my best to use Vim Bindings when editing.
* Integrate and Follow Google Java Stylesheet.
