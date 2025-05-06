<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="text"/>

    <xsl:template match="/">
        
        <xsl:text>{&#10;</xsl:text>
    <xsl:text>"factura": {&#10;</xsl:text>

    <xsl:text>"referencia": "</xsl:text><xsl:value-of select="factura/@referencia"/><xsl:text>",&#10;</xsl:text>
    <xsl:text>"fecha": "</xsl:text><xsl:value-of select="factura/@fecha"/><xsl:text>",&#10;</xsl:text>
    <xsl:text>"formaPago": "</xsl:text><xsl:value-of select="factura/@forma-pago"/><xsl:text>",&#10;</xsl:text>
    <xsl:text>"moneda": "</xsl:text><xsl:value-of select="factura/@moneda"/><xsl:text>",&#10;</xsl:text>
    <xsl:text>"subtotal": </xsl:text><xsl:value-of select="factura/@subtotal"/><xsl:text>,&#10;</xsl:text>
    <xsl:text>"total": </xsl:text><xsl:value-of select="factura/@total"/><xsl:text>,&#10;</xsl:text>

    <xsl:text>"emisor": {</xsl:text>
    <xsl:text>"nombre": "</xsl:text><xsl:value-of select="factura/emisor/nombre"/><xsl:text>", </xsl:text>
    <xsl:text>"cif": "</xsl:text><xsl:value-of select="factura/emisor/@cif"/><xsl:text>", </xsl:text>
    <xsl:text>"regimenFiscal": "</xsl:text><xsl:value-of select="factura/emisor/regimen-fiscal"/><xsl:text>"},&#10;</xsl:text>

    <xsl:text>"receptor": {</xsl:text>
    <xsl:text>"nombre": "</xsl:text><xsl:value-of select="factura/receptor/nombre"/><xsl:text>", </xsl:text>
    <xsl:text>"cif": "</xsl:text><xsl:value-of select="factura/receptor/@cif"/><xsl:text>"},&#10;</xsl:text>

    <xsl:text>"conceptos": [</xsl:text>
    <xsl:for-each select="factura/conceptos/concepto">
      <xsl:text>{</xsl:text>
      <xsl:text>"descripcion": "</xsl:text><xsl:value-of select="."/><xsl:text>", </xsl:text>
      <xsl:text>"claveProdServ": "</xsl:text><xsl:value-of select="@claveprodserv"/><xsl:text>", </xsl:text>
      <xsl:text>"cantidad": </xsl:text><xsl:value-of select="@cantidad"/><xsl:text>, </xsl:text>
      <xsl:text>"valorUnitario": </xsl:text><xsl:value-of select="@valor-unitario"/><xsl:text>, </xsl:text>
      <xsl:text>"importe": </xsl:text><xsl:value-of select="@importe"/><xsl:text>}</xsl:text>
      <xsl:if test="position() != last()"><xsl:text>, </xsl:text></xsl:if>
    </xsl:for-each>
    <xsl:text>],&#10;</xsl:text>

    <xsl:text>"impuestos": [</xsl:text>
    <xsl:for-each select="factura/impuestos/impuesto">
      <xsl:text>{</xsl:text>
      <xsl:text>"tipo": "</xsl:text><xsl:value-of select="@impuesto"/><xsl:text>", </xsl:text>
      <xsl:text>"base": </xsl:text><xsl:value-of select="@base"/><xsl:text>, </xsl:text>
      <xsl:text>"porcentaje": </xsl:text><xsl:value-of select="@cuota"/><xsl:text>, </xsl:text>
      <xsl:text>"cantidad": </xsl:text><xsl:value-of select="."/><xsl:text>}</xsl:text>
      <xsl:if test="position() != last()"><xsl:text>, </xsl:text></xsl:if>
    </xsl:for-each>
    <xsl:text>]&#10;</xsl:text>

    <xsl:text>}&#10;</xsl:text>
    <xsl:text>}</xsl:text>
  </xsl:template>
        
    </xsl:template>

</xsl:stylesheet>
