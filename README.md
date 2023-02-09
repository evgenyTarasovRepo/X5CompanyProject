## Автоматизированные тесты для компании X5 Retail Group: https://www.x5.ru

## Содержание:
* [Инструменты и технологии](https://github.com/evgenyTarasovRepo/X5CompanyProject#%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D1%83%D0%B5%D0%BC%D1%8B%D0%B5-%D1%82%D0%B5%D1%85%D0%BD%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D0%B8)
* [Реализованные проверки](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%BA%D0%B8)
* [Сборка в Jenkins](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D1%81%D0%B1%D0%BE%D1%80%D0%BA%D0%B0-%D0%B2-jenkins)
* [Запуск тестов](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2)
* [Allure Report](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#allure-report)
* [Allure TestOps](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#allure-testops)
* [Jira](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#jira)
* [Telegram Bot](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#telegram-bot)
* [Selenoid video](https://github.com/evgenyTarasovRepo/X5CompanyProject/blob/master/README.md#%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%B0-%D0%B2-selenoid)


## Используемые технологии:
![Github](https://user-images.githubusercontent.com/33193991/217645174-5c7f82cf-039b-46a2-b920-278e51d6235d.svg)
![Allure](https://user-images.githubusercontent.com/33193991/217647882-5bf3780b-c1f8-496e-addd-735d9ec71fbf.svg)
![Allure_TO](https://user-images.githubusercontent.com/33193991/217647919-bc6466d4-af35-406c-ab88-e1282d90f99b.svg)
![Gradle](https://user-images.githubusercontent.com/33193991/217648002-9c051805-7a81-4991-911f-ce89a4674837.svg)
![Idea](https://user-images.githubusercontent.com/33193991/217648101-c28e341f-dd5d-4490-9e39-7a111681a9e2.svg)
![Java](https://user-images.githubusercontent.com/33193991/217648120-50753b8e-795e-4561-b5d7-aa526fea731a.svg)
![Junit5](https://user-images.githubusercontent.com/33193991/217648526-c4c86690-5699-4185-a3dc-a536de26ed9f.svg)
![Selenide](https://user-images.githubusercontent.com/33193991/217648542-bfcc5969-da60-4d1f-b7cb-1e8e9968362b.svg)
![Selenoid](https://user-images.githubusercontent.com/33193991/217648556-42e03766-0619-4d86-84f4-8c2d07df6374.svg)


## Реализованные проверки:
- *Проверка главной страницы*
- *Проверка страницы "Компания"*
- *Проверка страницы "Покупателю"*
- *Проверка страницы "Партнерам"*
- *Проверка страницы "Пресс-центр"*
- *Проверка страницы "Карьера"*
- *Проверка адреса*
- *Проверка контактов*
- *Проверка страницы VK*
- *Проверка страницы Дзен*
- *Проверка поиска*    

## Сборка в Jenkins
[Build](https://jenkins.autotests.cloud/job/eatarasov_x5project/11/)
![jenkins_build](https://user-images.githubusercontent.com/33193991/217834133-b35d48ca-3f48-42ae-9c6c-300266475ab7.png)

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
![allure_overview](https://user-images.githubusercontent.com/33193991/217834250-ffb863a9-cb40-4f8a-96bc-19f1c58ab37d.png)

__Тестовые сценарии:__
![allure_tc](https://user-images.githubusercontent.com/33193991/217834298-db4999a6-0f8a-4184-9a0c-6304436a6b9f.png)


## Allure TestOps
__Общаая информация:__
![allure_test_ops_overview](https://user-images.githubusercontent.com/33193991/217834341-d31debf4-46c9-4e30-96f0-969e565be57b.png)

__Тестовые сценарии:__
![allure_testOps_tc](https://user-images.githubusercontent.com/33193991/217834371-43a0187e-97e5-4aae-8587-f12def3d5cbc.png)


__Примеры запусков:__
![launches](https://user-images.githubusercontent.com/33193991/217834426-7b5f4b0f-28dc-462c-9194-d9bf2c96c835.png)

## Jira
__Пример интеграции:__
![jira](https://user-images.githubusercontent.com/33193991/217834488-7567ee6a-be61-4ca5-acf7-c86dfc5f5a0d.png)

## Telegram Bot:
![bot_result](https://user-images.githubusercontent.com/33193991/217834728-155d573d-3c68-492b-b014-3e7193fa388f.png)


## Запуск теста в Selenoid:
https://user-images.githubusercontent.com/33193991/217834752-dff1494b-7f35-44ea-b631-029fd8dc7e49.mp4




