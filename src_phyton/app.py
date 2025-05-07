from benchmarking import Benchmarking
import matplotlib
from metodos_ordenamiento import MetodosOrdenamiento
import matplotlib.pyplot as plt
from datetime import date, time, datetime

if __name__ == "__main__":
    print("Funciona")
    # Instancias
    benchmark = Benchmarking()
    metodos = MetodosOrdenamiento()

    tamanio = [500, 1000, 2000]
    resultados = []
    for tam in tamanio:
        arreglo = benchmark.build_arreglo(tam)
        metodos_a_probar = {
            "burbuja": metodos.sortByBubble,
            "seleccion": metodos.sortBySelection
        }

        for nombre, metodo in metodos_a_probar.items():
            tiempo = benchmark.medir_tiempo(metodo, arreglo.copy())
            tuplaResultado = (tam, nombre, tiempo)
            resultados.append(tuplaResultado)

    for resultado in resultados:
        tam, nombre, tiempo = resultado
        print(f"Tamaño: {tam}, Método: {nombre}, Tiempo: {tiempo:.6f}")

    tiempos_by_metodo = {
        "burbuja": [],
        "seleccion": []
    }
    for tam, nombre, tiempo in resultados:
        tiempos_by_metodo[nombre].append(tiempo)  

    plt.figure(figsize=(10, 6),num="ISRAEL ORELLANA")

    for nombre, tiempo in tiempos_by_metodo.items():
        plt.plot(tamanio, tiempo, label=nombre, marker='o')
    fechaac=datetime.now()
    fecha=fechaac.strftime("%Y-%m-%d %H:%M:%S" )
    plt.xlabel("Tamaño")
    plt.ylabel("Tiempo")
    
    plt.title(f"Comparativa metodos \n Israel Orellana - {fecha}")
    plt.legend()
    plt.grid(True)
    plt.show()
    