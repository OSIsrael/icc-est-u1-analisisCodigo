from benchmarking import Benchmarking
from metodos_ordenamiento import MetodosOrdenamiento
if __name__=="__main__":
    print("Funciona")
    #Instancias
    benchmark=Benchmarking()
    metodos=MetodosOrdenamiento()

    tamanio=1000000
    arreglo=benchmark.build_arreglo(tamanio)

    metodos={
            "burbuja":metodos.sortByBubble,
            "seleccion":metodos.sortBySelection
            }
    resultados=[]
    for nombre,metodo in metodos.items():
        tiempo=benchmark.medir_tiempo(metodo,arreglo)
        tuplaResultado=(tamanio,nombre,tiempo)
        resultados.append(tuplaResultado)
    for resultado in resultados:
        tamanio,nombre,tiempo=resultado
        print(f"Tamano: {tamanio}, Metodo: {nombre}, Tiempo: {tiempo:.6f}")

