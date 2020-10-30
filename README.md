# Sample Automation Framework
The following is a sample automation framework that uses Page Objects for testing.

## Prerequisites
- Make sure you have Java 11 & Maven and available on the PATH
- Make sure you have the chrome driver in a folder called drivers on the `C:\\ drivers`

## Framework Overview
The framework has three separate packages:
`com.pages` - has all Page Objects and the PageFactory
`com.utils` - containing the factory to start the driver(s)
`com.framework` - under the tests directory, these are all the tests and code examples.

### Test Examples
In the `com.framework` tests, there are 8 tests that show various ways that Selenium can be used in testing.  
- BaseTest.java: is the base class for all tests and has the setup and teardown code for the Suite of tests
- AlertDialogTest extends BaseTest: this is an example test that shows how to work with popup windows
- DragAndDropTest extends BaseTest: shows how to drag and drop items in the UI
- HTML5FormsTest extends BaseTest: shows the use of the JS Executor to set `value` properties in HTML5.  These examples are to show how to work around the 'difficult' to test HTML5 items
- OverviewTabTests extends BaseTest: and is an example of how to implement the Page Models to abstract away the individual actions in the test cases and place these actions in the Page Objects.

