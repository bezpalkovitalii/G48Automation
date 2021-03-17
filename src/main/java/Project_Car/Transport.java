package Project_Car;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Transport {

    protected final Logger log;

    protected String name;

    public Transport(String name) {
        this.log = LogManager.getLogger(name);
        this.name = name;

    }

    public Transport() {
        this.log = LogManager.getLogger(this.getClass().getName());

    }

    public void displaysName() {
        log.info(this.name + " Выведен текст");
    }

    public void wordList(List<String> list) { // Перебераем массив, и печатаем в консоль каждый элемент массива, в виде массива букв
        try {
            for (int i = 0; i < list.size(); i++) {
                String[] strings = list.get(i).split("");
                log.debug(Arrays.toString(strings));
            }
        } catch (NullPointerException i) {
            log.error("Массив не определён. Пожалуйста проверте корректность вводимых значений", i);
        } catch (Exception i) {
            log.error("Произошла неизвесная ошибка. Подробнее:", i);
        }

    }

}
