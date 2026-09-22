# converter

A small Java Swing desktop program with two converters: miles to kilometers
and degrees Fahrenheit to degrees Celsius. The window shows three buttons.
The two converter buttons open an input dialog, read a number, and show the
result in a message dialog; the third button exits.

## Build and run

Requires a JDK (Java 8 or later). There is no build tool; compile the three
source files directly.

```sh
javac *.java
java ConverterGui
```

`Main.java` is a separate class that only prints `Main Complete`; the GUI
entry point is `ConverterGui`.

## Layout

- `ConverterGui.java` - the Swing window, the three buttons and their event
  handlers, and `main()`
- `Converter.java` - a `Converter` base class holding the input value, and
  the `TemperatureConverter` and `DistanceConverter` subclasses that
  override `convert()` (distance uses a factor of 1.609)
- `Main.java` - a stub class that prints a message and exits

Status: coursework project, kept for reference.
