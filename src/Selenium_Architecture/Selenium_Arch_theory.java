package Selenium_Architecture;

public class Selenium_Arch_theory {

	/*
	 * https://www.youtube.com/watch?v=x7MJGGS1uAI
	 * https://qacraft.com/selenium-3-vs-selenium-4/
	 * 
	 * View the notes -->
	 * 
	 * https://docs.google.com/document/d/1cmV-UJVce1jyqtvTjJHmgZD4sYLpo-
	 * 1o_lyoV9k7n48/edit?tab=t.0
	 * 
	 * Selenium 3 architecture supports JSON Wire Protocol, here JSON stands for
	 * JavaScript Object Notation. Selenium 4 does not include the JSON Wire
	 * Protocol and that’s the main difference between selenium 4 and Selenium 3.
	 * 
	 * JSON Wire Protocol transfers the information from the client to the server
	 * over HTTP, here HTTP stands for Hypertext Transfer Protocol, in this, a
	 * selenium request is sent from a selenium client, the request is received by
	 * the JSON Wire Protocol over HTTP, and secured by the browser Driver, after
	 * that a response returned by the server and received by the client.
	 * 
	 * Means:
	 * 
	 * Your automation code sends a command (like "click this button") in JSON
	 * format via HTTP. This request is picked up by the browser driver (like
	 * ChromeDriver), which validates and executes the command securely in the
	 * actual web browser.
	 * -----------------------------------------------------------------
	 * 
	 * Key Terms Explained: 1. Request
	 * 
	 * A command you (or an automation script) send to control a web browser.
	 * 
	 * Example: "Open Google Chrome", "Click this button", "Get the page title".
	 * 
	 * 2. JSON Wire Protocol
	 * 
	 * A protocol (set of rules) used to communicate between your test script and
	 * the web browser.
	 * 
	 * It sends and receives data in JSON format (JavaScript Object Notation).
	 * 
	 * It defines how commands like "click", "navigate", "get element" are
	 * structured and transmitted.
	 * 
	 * 3. Over HTTP
	 * 
	 * The communication happens via HTTP requests (just like how browsers fetch web
	 * pages).
	 * 
	 * Your automation tool sends commands to the browser using HTTP.
	 * 
	 * 4. Browser Driver
	 * 
	 * A small piece of software that connects the browser (like Chrome, Firefox)
	 * with your automation code.
	 * 
	 * Examples:
	 * 
	 * chromedriver.exe for Google Chrome
	 * 
	 * geckodriver for Firefox
	 * 
	 * It acts as a translator and gatekeeper, receiving requests via the protocol,
	 * executing them in the browser, and sending back responses.
	 * 
	 * 5. Secured by the browser Driver
	 * 
	 * The browser driver ensures that:
	 * 
	 * Only valid and safe commands are executed.
	 * 
	 * Communication is handled correctly.
	 * 
	 * Sometimes, it may even add security features (like checking origin of
	 * commands or running in sandboxed environments).
	 * 
	 * ✅ Putting It All Together:
	 * 
	 * "The request is received by the JSON Wire Protocol over HTTP, and secured by the browser Driver."
	 * 
	 * Means:
	 * 
	 * Your automation code sends a command (like "click this button") in JSON
	 * format via HTTP. This request is picked up by the browser driver (like
	 * ChromeDriver), which validates and executes the command securely in the
	 * actual web browser.
	 * 
	 * 
	 */
}
