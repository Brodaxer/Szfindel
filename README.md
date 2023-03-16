# Szfindel
Zdefiniuj metodę, która przyjmuje dwa napisy i zwraca true, jeżeli oba napisy składają się dokładnie z takich samych liter lub false, jeżeli chociaż jedna litera się różni. Wielkość liter nie ma znaczenia, tzn. literę 'a', traktujemy tak samo jak 'A'.

Przykładowo dla napisów "abcDEF" i "aDbECF" otrzymamy true, a dla "abcDEF" i "ABCxyz" otrzymamy false.

Przy porównywaniu zadbaj o odpowiednią obsługę wartości null. Porównanie ze sobą dwóch wartości null powinno zwrócić wartość true, porównanie dowolnego napisu, np. "abc" i wartości null powinno zwrócić false.

Dodaj logikę pozwalającą użytkownikowi wprowadzić dwa napisy z klawiatury i przetestuj działanie dla kilku różnych napisów.
