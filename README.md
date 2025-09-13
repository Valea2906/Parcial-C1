# Parcial-C1


## Arquitectura y Patrones

- **Patrón Factory (Creacional):**  
  La clase `EcciNotificacion` crea dinámicamente la implementación de `Notificacion` según el canal.

- **Patrón Strategy (Comportamiento):**  
  Cada canal (`EmailNotificacion`, `SMSNotificacion`, `MovilNotificaciones`) implementa la interfaz `Notificacion`, encapsulando su lógica de envío.

- **Principios SOLID aplicados**


## Diagrama de Contexto

![Diagram contexto.png](docs%2Fimagenes%2FDiagram%20contexto.png)

## Diagrama Casos de Uso

![Blank diagram.png](docs%2Fimagenes%2FBlank%20diagram.png)

## Diagrma de clases 
   ![diagrama de clases.png](docs%2Fimagenes%2Fdiagrama%20de%20clases.png)

## Evidencia del funcionamiento

![img.png](docs%2Fimagenes%2Fimg.png)

- El usuario ingresa su nombre y elige que Canal quiere que se le envie  su notificació.

## Pruebas de unidad de las clase 

![img_1.png](docs%2Fimagenes%2Fimg_1.png)
![img_2.png](docs%2Fimagenes%2Fimg_2.png)
![img_3.png](docs%2Fimagenes%2Fimg_3.png)
![img_4.png](docs%2Fimagenes%2Fimg_4.png)
![img_5.png](docs%2Fimagenes%2Fimg_5.png)

## Jacoco
![img_6.png](docs%2Fimagenes%2Fimg_6.png)
