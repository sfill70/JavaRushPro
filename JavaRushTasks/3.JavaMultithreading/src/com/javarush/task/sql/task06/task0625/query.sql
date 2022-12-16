-- Write your code here:
# Напиши запрос, который создаст индекс population_index в таблице cities по колонке population.


ALTER TABLE cities
    ADD INDEX population_index (population);
