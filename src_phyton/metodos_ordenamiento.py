
class MetodosOrdenamiento:
    def sortByBubble(self,arreglo):
        arreglo=arreglo.copy()
        n=len(arreglo)
        for i in range(n):
            for j in range(i+1,n):
                if arreglo[i]>arreglo[j]:
                    arreglo[i],arreglo[j]=arreglo[j],arreglo[j]
        return arreglo
    
    def sortBySelection(self,arreglo):
        arreglo=arreglo.copy()
        n=len(arreglo)
        for i in range(0,n,1):
            indice=i
            for j in range(i+1,n,1):
                if arreglo[indice]>arreglo[j]:
                    indice=j
            if indice!=i:
                arreglo[indice],arreglo[i]=arreglo[i],arreglo[indice]
        return arreglo

