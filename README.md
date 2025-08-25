# Interactive Java Mad Libs — Practice Input, Strings & Colors

[![Releases](https://img.shields.io/badge/Releases-download-blue?logo=github)](https://github.com/javimdbx/madLibsGame/releases)  🎲 ✍️ 🖥️

Fun, terminal-based Mad Libs built in Java. This repo helps you practice user input, string handling, and terminal colors while you create silly stories. Use the Releases page to get a runnable artifact.

---

Badges
- Topics: `code` `coding` `cool` `coolinteliji` `java` `madlibs` `mini` `miniproject` `practice` `summarize`
- Build: local Java program
- Release downloads: use the Releases link above or below

Screenshots
- Terminal view (sample):  
  ![Terminal screenshot](https://images.unsplash.com/photo-1515879218367-8466d910aaa4?auto=format&fit=crop&w=1200&q=80)
- Writing and creativity:  
  ![Write image](https://images.unsplash.com/photo-1517620424156-85e4d5f2b9f9?auto=format&fit=crop&w=1200&q=80)

Features
- Interactive prompts that ask for nouns, verbs, adjectives, names, and numbers.
- Simple input validation so the app asks again on empty input.
- Colorful terminal output using ANSI escape codes.
- Multiple story templates. You can add more templates.
- Small codebase ideal for learning and modifying.
- Cross-platform: runs on any machine with a Java runtime.

Why this project
- Practice reading input with `Scanner`.
- Practice building strings with concatenation and `String.format`.
- Learn to print colored text in a terminal with ANSI codes.
- See a clear example of a tiny CLI Java app you can extend.

What you get in Releases
- Downloadable runnable artifact named `madLibsGame.jar` or similar ZIP containing that JAR.
- Release notes and a version tag.
- Use the Releases page to pick a version and asset. Visit: https://github.com/javimdbx/madLibsGame/releases and download the JAR. After download, run the JAR on your system.

Quick start (download & run)
- Visit the Releases page and download the provided artifact.
- Download the file `madLibsGame.jar` from the release assets.
- Run the program with: `java -jar madLibsGame.jar`
- If you get permission issues on Linux/macOS, make sure your Java runtime is installed and up to date.

If the release link ever changes or fails, check the repository "Releases" section on GitHub for the latest artifact and instructions.

How it works (high level)
- The app shows a short prompt for each word the story needs.
- It collects each input into variables.
- It plugs those values into a story template with simple string formatting.
- It prints the final story using colored sections for emphasis.

Example session
- The program asks: "Enter a name:"
- You type: `Alex`
- Program asks for `adjective`, `verb`, `place`, and `number`.
- Final output highlights parts of the story in color and prints the completed Mad Lib.

Code structure (typical)
- `src/` - main Java sources
  - `Main.java` - program entry point, runs the game loop
  - `Story.java` - story templates and format helpers
  - `ConsoleColor.java` - ANSI code helpers
  - `InputUtils.java` - input and validation helpers
- `README.md` - this file
- `build.gradle` or `pom.xml` if you use Gradle/Maven (optional)
- `LICENSE` - project license (MIT by default in many small repos)

Key code ideas (plain text)
- Use `Scanner` to read user input from `System.in`.
- Use `String.format` or `+` to build story text.
- Use constants for ANSI color codes, for example `\u001B[32m` for green and `\u001B[0m` to reset.
- Keep templates in a list so the program can pick one at random.

Tips to extend
- Add more story templates. Keep placeholders consistent (e.g., `%s` or named keys).
- Add support for saving completed stories to a text file.
- Add a scoring system or a timer for fast responses.
- Add unit tests for input validation and template substitution.
- Add internationalization: load templates from JSON or properties files.

Customization examples
- New template (fill into `Story.java`):
  - Template string: "Yesterday, %s went to the %s and found a %s that could %s."
  - Prompt order: `name`, `place`, `object`, `verb`
- Change colors: adjust `ConsoleColor` constants to match your terminal.
- Replace `Scanner` with `BufferedReader` if you prefer.

Contributing
- Fork the repo.
- Create a feature branch: `git checkout -b feature/new-template`
- Add tests if you introduce logic.
- Open a pull request with a clear description of changes.
- Keep commits small and focused.

License
- Use a permissive license such as MIT to allow reuse in learning projects.
- Add a `LICENSE` file at the project root.

Teaching ideas
- Use this project in a class to teach string manipulation.
- Ask students to add error checks for numeric input.
- Use it to show how to separate concerns: input, logic, and output.

Common troubleshooting
- If `java -jar madLibsGame.jar` fails with "no main manifest attribute", re-create the JAR with a manifest that points to the main class.
- If colors look odd on Windows, use a terminal that supports ANSI codes or add a toggle to disable colors.

Release notes and download
- Releases are available on the GitHub Releases page. Download the asset `madLibsGame.jar` and run it with `java -jar madLibsGame.jar`.
- Visit the Releases page: https://github.com/javimdbx/madLibsGame/releases

Project ideas that build on this
- Turn the CLI into a GUI using JavaFX or Swing.
- Make a web-based version using a simple HTTP server and a web form.
- Persist user-created templates and let users choose them at runtime.
- Create a library that exposes template rendering for other programs.

Contact and maintainers
- Open an issue on GitHub for bugs or feature requests.
- Submit PRs for improvements.
- Use clear titles in issues and PRs. Provide steps to reproduce any bug.

SEO and discoverability tips
- Use descriptive commit messages and tags.
- Add keywords in the repo description and topics (done at top).
- Include usage examples in the README so search engines index real code snippets and commands.

Useful commands (local)
- Build with Gradle: `./gradlew build` (if Gradle files exist)
- Run from class files: `java -cp out/production/Main Main`
- Run the packaged JAR: `java -jar madLibsGame.jar`

Legal
- If you provide third-party images in the README, follow their license and give attribution if required.
- Add a `LICENSE` file that matches how you want others to use the code.

Enjoy building and modifying the stories. Visit the Releases page to download the ready-to-run JAR and start playing: https://github.com/javimdbx/madLibsGame/releases

<!-- End of README -->