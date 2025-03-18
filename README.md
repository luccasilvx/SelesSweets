## Diagrama de Caso de Uso
![map](https://github.com/user-attachments/assets/e5174174-acbe-421b-b721-cf02e5b0ed86)

## Diagrama Entidade-Relacionamento (DER)

```mermaid
	classDiagram
    class Client {
        +int id_client
        +string name
        +int age
        +string email
        +string phone
    }

    class Admin {
        +int id_admin
        +string name
        +string email
        +string password
    }

    class Evaluation {
        +int id_evaluation
        +int id_client
        +string purchased_products
        +int flavor_quality
        +int product_variety
        +int service_quality
        +int delivery_rating
        +string favorite_aspect
        +string improvement_suggestion
    }
``` 
