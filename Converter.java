

// Converter class hierarchy 
class Converter {
    private double input;

	// Default constructor for the converter class
    public Converter() {
        this.input = Double.NaN;
    }

	// A method that overloads the constructor 
    public Converter(double input) {
        this.input = input;
    }

	// Get method for input attribute
    public double getInput() {
        return input;
    }

	// Set method for input attribute
    public void setInput(double input) {
        this.input = input;
    }

	// A method that returns input
    public double convert() {
        return input;
    }
}

// TemperatureConverter class
class TemperatureConverter extends Converter {
	// Constructor that calls the parent constructor 
    public TemperatureConverter() {
        super();
    }

	// Constructor that calls the parent constructor with input parameter
    public TemperatureConverter(double input) {
        super(input);
    }

	// A method that overides the parent convert method
    @Override
    public double convert() {
		// if (Double.isNaN(super.getInput())) {
        if (super.getInput() != Double.NaN) {
			// Apply the formular for conversion 
            return ((super.getInput() - 32) * 5) / 9;		
        } else {
			return Double.NaN;
		}
    }
}

// DistanceConverter class
class DistanceConverter extends Converter {
	// Constructor that calls the parent constructor 
    public DistanceConverter() {
        super();
    }

	// Constructor that calls the parent constructor with input parameter
    public DistanceConverter(double input) {
        super(input);
    }

	// A method that overides the parent convert method
    @Override
    public double convert() {
        if (super.getInput() != Double.NaN ) {
			// Apply the formular for conversion 
            return super.getInput() * 1.609;
        } else {
			return Double.NaN;
		}
    }
}