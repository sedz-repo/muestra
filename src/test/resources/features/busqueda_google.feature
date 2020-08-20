@tag
Feature: Busqueda de google

  @tag1
  Scenario: Busqueda en las diferentes opciones de google
    Given que Juan esta en google
    When el busca Camionestas
    Then el vera los tipos de opciones para buscar
      | Todos        |
      | Imágenes     |
      | Videos       |
      | Maps         |
      | Noticias     |
      | Más          |
      | Preferencias |
      | Herramientas |

