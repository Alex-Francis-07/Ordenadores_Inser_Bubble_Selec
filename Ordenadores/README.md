Taller 

-> Estudiantes:
    Alex Sigcho
    Ivett Zaragocin

-> Ciclo:
    3ero "A"

-> Tema:
    Algoritmos de ordenación (Inserción, Selección y Burbuja)

-> División del trabajo:
    Alex Sigcho: Clase BubbleSort, Insertion Sort y SortingUtils
    Ivett Zaragocin: Selection Sort, Sorting Demo y SortingWorkbench

-> Estructura y funcionalidades del proyecto:
    El proyecto se encuentra dentro de la carpete src.

    * BubbleSort: Esta clase recibe un arreglo y compara varias veces los pares de elementos
    adyacentes, intercambiándolos en el caso de que el orden sea incorrecto, haciendo que 
    los elementos más grandes "floten" hasta el final 

    * InsertionSort: Esta clase recibe un arreglo y lo ordena moviendo cada elemento "hacia atrás"
    hasta encontrar su lugar correcto

    * SelectionSort: Esta clase recibe un arreglo, busca el elemento más pequeño y lo intercambia
    (swap) con la primera posición, luego busca el siguiente más pequeño y lo intercambia con la segunda,
    y así sucesivamente.

    * SortingDemo: Clase principal y ejecutabe, define los arreglos de prueba (A, B, C, D y E), genera evidencias
    
    *SortingWorkbench: Clase en la que el usuario puede interactuar, se presenta un menú con las siguientes
    opciones:
        1. Agregar Datos: Al elegir esta opción se va a solicitar el numero de datos que se quieren ingresar,
                          Se pide n datos para el arreglo
        2. Selection Sort: Muestra el proceso
        3. InsertionSort: Muestra el proceso
        4. BubbleSort: Muestra el proceso
        5. Salir: Fin 