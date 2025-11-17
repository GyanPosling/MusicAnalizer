# 🎵 Music Analyzer

**Веб-приложение для анализа музыкальных предпочтений на основе данных Last.fm**

## 📊 О проекте

Music Analyzer — это полнофункциональное веб-приложение, которое помогает пользователям глубоко анализировать свои музыкальные привычки. Приложение импортирует данные из Last.fm и предоставляет детальную статистику, визуализацию и инсайты о прослушиваниях.

## 🚀 Возможности

### 🎶 Музыкальная аналитика
- **Импорт истории прослушиваний** из Last.fm
- **Топ артистов и треков** за различные периоды
- **Статистика по жанрам** и музыкальным предпочтениям
- **Визуализация привычек** прослушивания
- **Сравнение музыкальных периодов**

### 🔐 Безопасность
- **JWT аутентификация**
- **Защищенные API endpoints**
- **Управление пользовательскими сессиями**

### 📱 Пользовательский опыт
- **Интуитивный интерфейс** на React
- **Адаптивный дизайн** для всех устройств
- **Интерактивные графики** и диаграммы
- **Быстрая навигация** между разделами

## 🏗 Архитектура

### Backend (Микросервисы)
- **API Gateway** — единая точка входа и маршрутизация
- **Auth Service** — управление аутентификацией и пользователями
- **Music Service** — обработка музыкальных данных и аналитика
- **Service Discovery** — регистрация и обнаружение сервисов

### Frontend
- **React SPA** с современным UI/UX
- **Состояние приложения** через React Query
- **Визуализация данных** с помощью Recharts

### Базы данных и инфраструктура
- **PostgreSQL** — основное хранилище данных
- **Docker** — контейнеризация и развертывание

## 🛠 Технологический стек

### Backend
- Java 17 & Spring Boot 3
- Spring Cloud & Microservices
- Spring Security с JWT
- Spring Data JPA & PostgreSQL
- Eureka Service Discovery

### Frontend
- React 18 с TypeScript
- Modern React Hooks
- React Router для навигации
- Recharts для визуализации
- Axios для API коммуникации

### DevOps & Infrastructure
- Docker & Docker Compose
- Микросервисная архитектура
- API Gateway паттерн
- Контейнеризация приложения

## 📁 Структура проекта

Проект организован в монорепозитории с четким разделением ответственности:

- **backend/** — микросервисы на Spring Boot
- **frontend/** — React веб-приложение
- **infrastructure/** — Docker конфигурации

## 🎯 Для кого этот проект

- **Меломаны** — для анализа своих музыкальных вкусов
- **Разработчики** — как пример full-stack приложения
- **Исследователи** — для анализа музыкальных предпочтений
- **Студенты** — для изучения микросервисной архитектуры

## 💡 Особенности реализации

- **Чистая архитектура** с разделением ответственности
- **Масштабируемая структура** для добавления новых функций
- **Производительность** за счет кеширования и оптимизации
- **Безопасность** через JWT и защищенные endpoints
- **Документированный код** для легкого понимания

## 🔮 Планы по развитию

- Интеграция с Spotify API
- Рекомендательная система на основе AI
- Социальные функции и sharing
- Мобильное приложение
- Расширенная аналитика с машинным обучением

---

music-analyzer/
├── backend/
│   ├── music-service/                 # Основной сервис (музыка + аналитика)
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/com/musicanalyzer/
│   │   │   │   │   ├── MusicAnalyzerApplication.java
│   │   │   │   │   ├── config/
│   │   │   │   │   │   ├── SecurityConfig.java
│   │   │   │   │   │   ├── WebConfig.java
│   │   │   │   │   │   └── RedisConfig.java
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├── MusicController.java
│   │   │   │   │   │   ├── AnalyticsController.java
│   │   │   │   │   │   ├── ParserController.java
│   │   │   │   │   │   └── UserDataController.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── MusicService.java
│   │   │   │   │   │   ├── AnalyticsService.java
│   │   │   │   │   │   ├── ParserService.java
│   │   │   │   │   │   ├── LastFmClient.java
│   │   │   │   │   │   └── StatisticsCalculator.java
│   │   │   │   │   ├── repository/
│   │   │   │   │   │   ├── TrackRepository.java
│   │   │   │   │   │   ├── ArtistRepository.java
│   │   │   │   │   │   ├── ListeningHistoryRepository.java
│   │   │   │   │   │   └── UserRepository.java
│   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── entity/
│   │   │   │   │   │   │   ├── User.java
│   │   │   │   │   │   │   ├── Track.java
│   │   │   │   │   │   │   ├── Artist.java
│   │   │   │   │   │   │   ├── Album.java
│   │   │   │   │   │   │   └── ListeningHistory.java
│   │   │   │   │   │   ├── dto/
│   │   │   │   │   │   │   ├── TrackDto.java
│   │   │   │   │   │   │   ├── ArtistDto.java
│   │   │   │   │   │   │   ├── AnalyticsResponse.java
│   │   │   │   │   │   │   └── ListeningStats.java
│   │   │   │   │   │   └── enums/
│   │   │   │   │   │     └── TimeRange.java
│   │   │   │   │   └── util/
│   │   │   │   │       ├── DateUtils.java
│   │   │   │   │       ├── MusicUtils.java
│   │   │   │   │       └── JsonParser.java
│   │   │   │   └── resources/
│   │   │   │       ├── application.yml
│   │   │   │       ├── data.sql
│   │   │   │       └── logback-spring.xml
│   │   │   └── pom.xml
│   ├── auth-service/                 # Сервис аутентификации
│   │   ├── src/main/java/com/musicanalyzer/auth/
│   │   │   ├── controller/AuthController.java
│   │   │   ├── service/JwtService.java
│   │   │   └── config/JwtAuthFilter.java
│   │   └── pom.xml
│   ├── api-gateway/                  # API Gateway
│   │   ├── src/main/java/com/musicanalyzer/gateway/
│   │   └── pom.xml
│   └── shared-libs/                  # Общие библиотеки
│       ├── common-dto/               # Общие DTO
│       └── security-config/          # Общая security конфигурация
├── frontend/                         # React приложение
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   ├── hooks/
│   │   ├── store/
│   │   └── utils/
│   └── package.json
└── infrastructure/                   # Docker и конфиги
    ├── docker-compose.yml
    └── nginx.conf

**Music Analyzer** — это не просто приложение, а целая экосистема для понимания и анализа вашей музыкальной личности! 🎧