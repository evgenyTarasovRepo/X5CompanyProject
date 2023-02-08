## Автоматизированные тесты для компании X5 Retail Group: https://www.x5.ru

## Содержание:
* [Инструменты и технологии](Технологии)
* [Реализованные проверки](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%BA%D0%B8)
* [Сборка в Jenkins](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D1%81%D0%B1%D0%BE%D1%80%D0%BA%D0%B0-%D0%B2-jenkins)
* [Запуск тестов](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2)
* [Allure Report](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#allure-report)
* [Allure TestOps](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#allure-testops)
* [Jira](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#jira)
* [Telegram Bot](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#telegram-bot)
* [Selenoid video](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%B0-%D0%B2-selenoid)


## Реализованные проверки:
- *Проверка главной страницы*
- *Проверка страницы "Компания"*
- *Проверка страницы "Покупателю"*
- *Проверка страницы "Партнерам"*
- *Проверка страницы "Пресс-центр"*
- *Проверка страницы "Карьера"*
- *Проверка поиска*    

## Сборка в Jenkins
[Build](https://jenkins.autotests.cloud/job/eatarasov_x5project/11/)
![jenkins_build](https://user-images.githubusercontent.com/33193991/217621473-d93f9080-63b9-4b1b-919e-3f83303e670a.png)

__*Параметры сборки:*__
![jenkins_parameters](https://user-images.githubusercontent.com/33193991/217621932-3a303704-eefe-46b2-b330-d82ff8257070.png)

## Запуск тестов

__*Локально, из терминала:*__
```
gradle clean tests_for_x5
```

__*Удалённо, из Jenkins:*__
```
clean
tests_for_x5
"-Dremote=${REMOTE}"
"-Dbrowser=${BROWSER}"
"-DbrowserSize=${BROWSER_SIZE}"
"-DbrowserVersion=${BROWSER_VERSION}"
```

## Allure Report
__*Ссылка на*__ [отчёт](https://jenkins.autotests.cloud/job/eatarasov_x5project/11/allure/)

__Общаая информация:__
![Allure_report_overview](https://user-images.githubusercontent.com/33193991/217624029-481594d0-24dc-47a5-8a7f-482c2149c04b.png)

__Тестовые сценарии:__
![Allure_test_cases](https://user-images.githubusercontent.com/33193991/217624244-9ddfd446-4655-4065-b8f5-1f7728aae2c3.png)


## Allure TestOps
__Общаая информация:__
![allureTestOps_overview](https://user-images.githubusercontent.com/33193991/217625514-72feb9ff-5777-43b4-9540-233143852590.png)

__Тестовые сценарии:__
![allureTestOps_tc](https://user-images.githubusercontent.com/33193991/217625551-a80a03df-05eb-4032-a795-8c881524ba37.png)

__Примеры запусков:__
![launches](https://user-images.githubusercontent.com/33193991/217625597-1db4eff9-5106-4508-b94f-48f81eb55e53.png)


## Jira
__Пример интеграции:__
![jira](https://user-images.githubusercontent.com/33193991/217626087-ed6356fc-4da0-4cca-947f-63103a0f4350.png)

## Telegram Bot:
![bot_result](https://user-images.githubusercontent.com/33193991/217626265-9222ab40-c73a-4d7f-9869-a9827fc2a05b.png)

## Запуск теста в Selenoid:
https://user-images.githubusercontent.com/33193991/217626540-470d1535-de99-4dbd-a084-7ef34d7c1a1c.mp4


