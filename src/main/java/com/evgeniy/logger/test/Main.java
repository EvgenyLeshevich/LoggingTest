package com.evgeniy.logger.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
//        https://www.tutorialspoint.com/log4j/log4j_logging_levels.htm
        // Есть несколько уровней логгера:
        // Trace - пишем чуть ли не каждый шаг того что происходит в программе
        // Debug - когда есть необходимость написать не только сообщение, но и какие-то параметры
        // (например есть какое-то вычисление, получаем какие-то данные и эти данные выписываем в логгер)
        // Info - важные сообщения (не ошибка! например стартовала какая-то подсистема, инициализированы
        // какие-то серьёзные параметры, прогружены какие-то конфигурации)
        // Warning - предупреждение (что-то пошло не так, но программа не сломалась)
        // Error - серьёзная ошибка
        LocalDateTime dt = LocalDateTime.now();
        logger.info("TEST {}", dt); // Передавать параметры нужно именно так, не через "+"
        // То есть сначала мы заходим внутрь, передаём туда просто строку("TEST {}") и просто параметры (dt)
        // И только после проверки, нужно ли выполнять метод info начнётся преобразование dt в строчки (toString)

        // Logger Levels:
//        ALL	 -   All levels including custom levels.
//        DEBUG	 -   Designates fine-grained informational events that are most useful to debug an application.
//        INFO	 -   Designates informational messages that highlight the progress of the application at coarse-grained level.
//        WARN	 -   Designates potentially harmful situations.
//        ERROR	 -   Designates error events that might still allow the application to continue running.
//        FATAL	 -   Designates very severe error events that will presumably lead the application to abort.
//        OFF	 -   The highest possible rank and is intended to turn off logging.
//        TRACE	 -   Designates finer-grained informational events than the DEBUG.

        List<String> loggerLevels = Arrays.asList("All", "Debug", "Info", "Warn", "Error", "Fatal", "Off", "Trace");
        for (String level:
             loggerLevels) {
            logger.info(level);
        }
    }
}
