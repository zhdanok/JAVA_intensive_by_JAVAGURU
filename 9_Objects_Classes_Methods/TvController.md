###Описание:
Разработать программу, которая демонстрирует умением связывать объекты между собой и их взаимодействием.

###Функциональные требования:
Разработать классы телевизор Tv и TvController с учетом инкапсуляции.

Класс Tv можно брать из предыдущего задания, поскольку требования идентичны.

Класс TvController должен обладать следующими характеристиками:

###Свойства

Подключенный телевизор
###Методы

- Дублируются методы класса Tv
- Подключить телевизор к пульту (выступает в роли setter метода для поля Tv tv)
- Через пульт необходимо контролировать телевизор (напр. включать, менять канал или уровень громкости).

###Нефункциональные требования:
Продемонстрировать подключение телевизора к пульту, а также использование методов пульта, которые делегируют вызов на телевизор, к которому подключен пульт