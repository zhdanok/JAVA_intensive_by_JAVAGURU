###Описание:
Разработать программу, которая демонстрирует работу с инкапсуляцией, а также переопределением базовых методов класса.

###Функциональные требования:
Разработать класс телевизор Tv с учетом инкапсуляции, который обладает следующими характеристиками:

###Свойства

- Текущий канал
- Текущая громкость
- Производитель
- Включен ли телевизор

###Методы

- Переключить на следующий канал (увеличить текущий канал на 1 ед.)
- Переключить на предыдущий канал (уменьшить текущий канал на 1 ед.)
- Увеличить звук (увеличить громкость на 1 ед.)
- Уменьшик звук (уменьшить громкость на 1 ед.)
- Включить телевизор
- Выключить телевизор

Переключать каналы и менять громкость можно только у включенного телевизора.

Для каждого из полей написать вспомогательные методы getter (напр. int getCurrentChannel()).

Необходимо переопределить методы equals() и toString().

###Нефункциональные требования:
Продемонстрировать работу всех методов, включая переопределенные в демонстрационном классе TvDemo.

###Опционально: 
Написать тестовые сценарии для класса Tv в классе TvTest. Все тестовые сценарии должны отрабатывать без ошибок.