package com.example

import org.junit._
import org.junit.Assert.{assertNotNull, assertEquals}
import io.appium.java_client.MobileElement
import io.appium.java_client.ios.IOSDriver
import org.openqa.selenium._
import org.openqa.selenium.remote.DesiredCapabilities

import java.net.URL

class WebAppTest {
  var driver: IOSDriver[MobileElement] = null

  @Before
  def setUp(): Unit = {
    val capabilities = new DesiredCapabilities()
    val url = new URL("http://127.0.0.1:4723/wd/hub")

    driver = new IOSDriver[MobileElement](url, capabilities)
  }

  @After
  def tearDown(): Unit = {
    if (driver != null) driver.quit()
  }

  @Test
  def runTest1(): Unit = {
    driver.get("https://dev.classmethod.jp")
    Thread.sleep(5000)

    val idElement = driver.findElement(By.className("logo"))
    assertNotNull(idElement)
    assertEquals("Developers.IO", idElement.getText())
  }
}