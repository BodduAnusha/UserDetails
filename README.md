Run your Application
Name: Allows users to input their name.
Type: Text input
Attribute: name="name"
Example: John Doe
Email: Allows users to input their email address.
Type: Email input
Attribute: name="email"
Example: john@example.com
Age: Allows users to input their age. Only accepts non-negative integers.
Type: Number input with minimum value set to 0
Attribute: name="age"
Example: 30
DOB: Allows users to input their date of birth.
Type: Date input
Attribute: name="dob"
Example: 1990-01-01
Action: The form data is submitted to the server-side endpoint /add using the POST method.
Attribute: action="add"
Method: POST
Submit Button: Allows users to submit the form data.
Type: Submit button
Value: "SUBMIT"
Example: Upon clicking this button, the form data is submitted.
View All Details: Users can view all submitted details by clicking on the "View All Details" link.
Link: <a href="view">View All Details</a>
Example: Upon clicking this link, users are directed to a page to view all submitted details.
The provided HTML form offers a user-friendly interface for users to input their details. The form submission process sends the data to a server-side endpoint for further processing, and users can also view all submitted details through an additional link.
