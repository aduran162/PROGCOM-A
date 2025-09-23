def calcularvpn(flujos, tasadescuento):
    """
    Calcula el Valor Presente Neto (VPN).
    """
    i = 0
    vpn = 0
    while i < len(flujos):
        vpn = vpn + flujos[i] / ((1 + tasadescuento) ** i)
        i = i + 1
    return vpn


def calculartir(flujos, intentos=100):
    """
    Calcula la TIR con método de prueba y error.
    """
    tasamin = -0.999
    tasamax = 1.0
    contador = 0
    
    while contador < intentos:
        tasamedia = (tasamin + tasamax) / 2
        vpn = calcularvpn(flujos, tasamedia)
        
        if vpn > 0:
            tasamin = tasamedia
        else:
            tasamax = tasamedia
        
        contador = contador + 1
    
    return tasamedia


# Ejemplo de uso

# Flujos del proyecto
flujosproyecto = [-1000, 300, 400, 500, 600]

# Tasa mínima de ganancia (10%)
tasadescuento = 0.10

# Calcular VPN y TIR
vpn = calcularvpn(flujosproyecto, tasadescuento)
tir = calculartir(flujosproyecto)

# Mostrar resultados
print("Flujos de dinero del proyecto:", flujosproyecto)
print("Tasa mínima esperada:", tasadescuento*100, "%")
print("Valor Presente Neto (VPN):", round(vpn, 2))
print("Tasa Interna de Retorno (TIR):", round(tir*100, 2), "%")
