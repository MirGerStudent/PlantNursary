# Определяем переменные
MVN = mvn
TARGET_DIR = target
JAR_FILE = $(TARGET_DIR)/PlantNursary-1.0-SNAPSHOT.jar

# Основные цели
.PHONY: all clean build run

# Цель по умолчанию
all: build

# Сборка проекта
build:
	$(MVN) clean package

# Запуск приложения
run: build
	java -jar $(JAR_FILE)

# Очистка скомпилированных файлов
clean:
	$(MVN) clean