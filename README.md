This is a web application developed using Spring MVC, Thymeleaf, and Java Validation API. The project demonstrates a simple customer registration form where users can submit their details, including name, postal code, course code, and free passes. The system is built with proper validation mechanisms to ensure that the form inputs are correctly validated before processing.

Key Features:
Spring MVC Framework: The project uses the Spring MVC architecture to handle requests and responses.
Server-side Validation: Java validation annotations are used to validate user input in the customer registration form, ensuring accurate and valid data.
Custom Validation Annotations: A custom validation annotation (@CourseCode) has been created to ensure that the course code entered by the user starts with a specific prefix.
Thymeleaf: The project uses Thymeleaf as the templating engine to render dynamic HTML content.
Error Handling: Form validation errors are displayed dynamically, providing users with immediate feedback on any invalid inputs.
Binding and Data Binding: The use of @ModelAttribute in the controller simplifies the data binding process between the form and the Java object (Customer).
Trim Input Fields: The @InitBinder method is used to trim whitespace from string fields, preventing issues due to unintended leading or trailing spaces in the form inputs.

Technologies Used:
Spring Framework (Spring MVC)
Thymeleaf (HTML templating engine)
Java Validation API (JSR 303 annotations)
Jakarta Bean Validation (for custom validation and constraints)
Spring Boot (Optional, for easy setup of Spring-based applications)

How It Works:
The user visits the registration form at the root URL (/).
The form is pre-populated with a new instance of the Customer object, ready for input.
When the user submits the form, the controller uses @Valid to trigger validation on the Customer object.
If validation fails, errors are shown on the form to guide the user in providing the correct information.
If validation is successful, the user is redirected to a confirmation page.

Validation Details:
Last Name: Must not be empty.
Free Passes: Must be between 0 and 10.
Postal Code: Must be exactly 5 characters/digits.
Course Code: Custom validation ensuring it starts with "SA" (or another prefix as configured).
