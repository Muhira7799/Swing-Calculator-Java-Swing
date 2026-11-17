# Swing Calculator – Java Swing

A Java desktop calculator built with Swing. It takes two numbers and performs addition, subtraction, multiplication, division, or modulus, with error messages for bad input.

## Features

- Two input fields (decimals and negatives are supported)
- Buttons for **Add**, **Subtract**, **Multiply**, **Divide**, and **Modulus**
- Read-only **Result** field
- Error messages shown in the result field, with no crashes

## Examples

| First | Second | Button | Result |
|-------|--------|--------|--------|
| 10 | 4 | Add | 14.0 |
| 10 | 4 | Subtract | 6.0 |
| 10 | 4 | Multiply | 40.0 |
| 10 | 4 | Divide | 2.5 |
| 10 | 3 | Modulus | 1.0 |

## Error Handling

| Problem | Message shown |
|---------|---------------|
| A field is empty or not a number | Enter valid numbers |
| Divide or Modulus with a second number of `0` | Cannot divide by zero |

## How It Works

- `SwingCalculator` extends `JFrame` and implements `ActionListener`, so one `actionPerformed` method handles every button.
- `e.getSource()` tells which button was clicked.
- A `try-catch` around `Double.parseDouble()` catches invalid input.
- Division and modulus check for zero before calculating.

## Requirements

- Java Development Kit (JDK) 8 or higher (Swing is included in the JDK)

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac SwingCalculator.java
java SwingCalculator
```

## Project Structure

```
.
├── SwingCalculator.java
└── README.md
```

## Possible Improvements

- Add a Clear button
- Add more operations such as power and square root
- Format the result to remove the trailing `.0` for whole numbers
- Start the window on the Swing event thread with `EventQueue.invokeLater()`
