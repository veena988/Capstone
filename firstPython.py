from selenium import webdriver
from selenium.webdriver.common.by import By
from pynput.keyboard import Key,Controller
import time

driver = webdriver.Chrome()
driver.get("http://the-internet.herokuapp.com/")
driver.maximize_window();
Checkboxes = driver.find_element(By.CSS_SELECTOR,"a[href='/checkboxes']")
Checkboxes.click()
checkbox1 = driver.find_element(By.XPATH,"//form[@id='checkboxes']/input[1]")
print(checkbox1.is_selected())
assert checkbox1.is_selected() == False
checkbox2 = driver.find_element(By.XPATH,"//form[@id='checkboxes']/input[2]")
print(checkbox2.is_selected())
assert checkbox2.is_selected() == True
driver.back()
fileupload1 = driver.find_element(By.CSS_SELECTOR,"a[href='/upload']")
fileupload1.click()
time.sleep(3)
driver.find_element(By.XPATH,"//input[@id='file-upload']").click();
time.sleep(3)
keyboard = Controller()
keyboard.type("C:\\Users\\vv2\\Desktop\\test.txt")
keyboard.press(Key.ENTER)
keyboard.release(Key.ENTER)
driver.find_element(By.ID,"file-submit").click()
