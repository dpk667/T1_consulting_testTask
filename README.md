# Тестовое задание для T1 Consulting

Этот проект содержит решение для тестового задания в T1 Consulting. Задание включает в себя создание API для подсчета частоты символов в строке, с возможностью игнорирования регистра.

## Структура проекта

- `src/main/java/dpk/t1_consulting_testtask/controller/FrequencyController.java`: Контроллер Spring Boot, предоставляющий API для вычисления частоты символов.
- `src/test/java/dpk/t1_consulting_testtask/FrequencyControllerTest.java`: Тесты для `FrequencyController`.

## Инструкция по запуску

1. Убедитесь, что у вас установлен Java и Maven. `java -version` и `mvn -version`
2. Клонируйте репозиторий: `git clone https://github.com/dpk667/T1_consulting_testTask.git`
3. Перейдите в директорию проекта: `cd T1_consulting_testTask`
4. Запустите тесты: `mvn test`
5. Запустите приложение: `mvn spring-boot:run`
6. Перейдите по адресу `http://localhost:8081/calculate-frequency?input=ваша_строка_для_тестирования_API` в браузере или используйте инструменты для тестирования API.

### Примечание для тестирования API:
__Этот API может быть протестирован с использованием инструментов для тестирования API, таких как Postman, 
а также напрямую из вашей среды разработки (IDE).__

## Примеры использования API

### 1. Расчет частоты символов

```bash
curl http://localhost:8081/calculate-frequency?input=aaaaabcccc
```
Результат: `{"a":5,"b":1,"c":4}`

### 2. Расчет частоты символов с игнорированием регистра

```bash
curl http://localhost:8081/calculate-frequency?input=AbCdeE&ignoreCase=true
```

Результат: `{"A":2,"b":1,"C":2,"d":1,"e":2}`

## Зависимости
Java 8 и выше
Spring Boot
JUnit 5
