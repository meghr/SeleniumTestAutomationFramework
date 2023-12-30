package org.meghraj.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager() {

    }

    /*
    Here, a ThreadLocal variable named driver is used. ThreadLocal allows you to create variables that can be accessed and
    modified by different threads independently. Each thread that accesses the variable sees its own, independently initialized copy.
     */
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    /*
    getDriver(): This method retrieves the WebDriver instance associated with the current thread. It uses the get() method of ThreadLocal.
     */
    public static WebDriver getDriver() {
        return driver.get();
    }

    /*
    setDriver(WebDriver driverRef): This method sets the WebDriver instance for the current thread.
        It uses the set() method of ThreadLocal to associate the driverRef with the current thread.
     */
    public static void setDriver(WebDriver driverRef) {
        driver.set(driverRef);
    }

    /*
    unload(): This method removes the WebDriver instance associated with the current thread.
    It uses the remove() method of ThreadLocal to clean up resources associated with the current thread.
     */
    public static void unload() {
        driver.remove();
    }
}
