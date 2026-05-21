# Selenium - Multiple Windows & Screenshot Capture Automation

## Project Overview
Automated multiple window handling and screenshot capture
using Selenium WebDriver with Java on a demo application.

## What This Project Does
- Navigates between multiple browser windows
- Switches window context using getWindowHandles()
- Fills form data and submits
- Extracts dynamically generated User ID and Password
- Captures screenshot using TakesScreenshot
- Prints extracted results in console

## Tools & Technologies
- Java
- Selenium WebDriver
- ChromeDriver
- TakesScreenshot
- Eclipse IDE

## Key Concept Learned
**Window Switching**
Without switching context correctly using
driver.switchTo().window(), Selenium interacts
with the wrong DOM and actions fail silently.
Proper window handling is critical in
real world automation.

## Approach
Understood the manual flow first,
then converted it into automation code.
This is the right way to approach
any automation task.
