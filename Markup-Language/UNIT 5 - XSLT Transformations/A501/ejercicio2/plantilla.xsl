<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="text"/>

    <xsl:template match="/">
    {
        "referencia": "<xsl:value-of select="factura/@referencia"/>",
        "fecha": "<xsl:value-of select="factura/@fecha"/>",
        "subtotal": "<xsl:value-of select="factura/@subtotal"/>",
        "total": "<xsl:value-of select="factura/@total"/>",
        "emisor": {
        "cif": "<xsl:value-of select="factura/emisor/@cif"/>",
        "nombre": "<xsl:value-of select="factura/emisor/nombre"/>"
        },
        "receptor": {
        "cif": "<xsl:value-of select="factura/receptor/@cif"/>",
        "nombre": "<xsl:value-of select="factura/receptor/nombre"/>"
        },
        "producto": {
        "nombre": "<xsl:value-of select="factura/conceptos/concepto"/>",
        "precioUnitario": "<xsl:value-of select="factura/conceptos/concepto
                /@valor-unitario"/>",
        "cantidad": "<xsl:value-of select="factura/conceptos/concepto
                /@cantidad"/>",
        "importe": "<xsl:value-of select="factura/conceptos/concepto
                /@importe"/>"
        },
        "impuesto": {
        "tipo": "<xsl:value-of select="factura/impuestos/impuesto
                /@impuesto"/>",
        "cuota": "<xsl:value-of select="factura/impuestos/impuesto/@cuota"/>",
        "importe": "<xsl:value-of select="factura/impuestos/impuesto"/>",
        }
    }
    </xsl:template>

</xsl:stylesheet>
