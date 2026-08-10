# Car Dealer Console

A simple Java console app to browse a car catalog, search for a car, and unlock a "Limited Edition 2026" section.

## Requirements

- Java JDK 8 or higher installed
- Check with:
  ```bash
  java -version
  javac -version
  ```

## Installation

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
   ```
2. Compile:
   ```bash
   javac Main.java
   ```
3. Run:
   ```bash
   java Main
   ```

## How it works

- **cars()**: prints the available car list, then asks you to type a car name to search for. If found, it confirms the match (case-insensitive).
- **limited()**: asks if you want to access the "Limited car edition 2026". Type `Yes!` (exact match, capital Y and exclamation mark) to reveal the limited cars list.

## What you can customize

- **Car list**: edit the `cars` array in `cars()`:
  ```java
  String[] cars = {"Corvette", "okksuper", "d'accordstv"};
  ```
- **Limited edition car list**: edit the `limitedCars` array in `limited()`:
  ```java
  String[] limitedCars = {"Porsche", "Ferrari", "Lamborghini"};
  ```
- **Answer trigger**: the `limited()` check currently requires the exact string `"Yes!"`. You can make it more forgiving with:
  ```java
  if (answer.equalsIgnoreCase("yes")) {
  ```

## Known issues / possible improvements

- Unused `import java.util.Random;` can be removed if not used elsewhere.
- `found` (in `cars()`) and `isLimited` (in `limited()`) are declared but never used for anything — consider adding a "not found" / "access denied" message using them.
- No input validation (e.g. empty search string).
- Search is exact match only (aside from case) — no partial/substring search yet.

## License

Feel free to add a license of your choice (e.g. MIT) if you plan to make this repo public.
