<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <meta lang="es"></meta>
                <meta charset="UTF-8"></meta>
                <meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>
                <meta name="description" content="width-device-view-port"></meta>
                <meta http-equiv="X-UA-Compatible" content="ie=edge"></meta>
                <link rel="stylesheet" href="estilos/estilo.css"></link>
                <title>plantilla.xsl</title>
            </head>
            <body>
                <header>
                    <h1>Factura</h1>
                </header>
                <br/>
                <br/>
                <table>
                    <tr>
                        <td colspan="2" class="texto-izq">Factura <xsl:value-of select="factura/@referencia"/></td>
                        <td colspan="2" class="texto-izq">Fecha <xsl:value-of select="factura/@fecha"/></td>
                    </tr>
                    <tr>
                      <td colspan="2" class="negrita">Emisor</td>
                      <td colspan="2" class="negrita">Receptor</td>
                    </tr>
                    <tr>
                      <td class="negrita">Nombre: </td>
                      <td class="texto-izq"><xsl:value-of select="factura/emisor/nombre"/></td>
                      <td class="negrita">Nombre: </td>
                      <td class="texto-izq"><xsl:value-of select="factura/receptor/nombre"/></td>
                    </tr>
                    <tr>
                      <td class="negrita">CIF: </td>
                      <td class="texto-izq"><xsl:value-of select="factura/emisor/@cif"/></td>
                      <td class="negrita">CIF: </td>
                      <td class="texto-izq"><xsl:value-of select="factura/receptor/@cif"/></td>
                    </tr>
                    <tr>
                      <td colspan="4"> 
                        <xsl:value-of select="factura/conceptos/concepto"/> 
                        <xsl:value-of select="factura/conceptos/concepto/@importe"/>
                      </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <span class="negrita">Impuestos: </span>
                            <xsl:value-of select="factura/impuestos/impuesto/@impuesto"/> 
                            <xsl:value-of select="(factura/impuestos/impuesto/@cuota) * 100"/>%: 
                            <xsl:value-of select="factura/impuestos/impuesto"/>
                      </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <span class="negrita">Total sin impuestos: </span> 
                            <xsl:value-of select="factura/impuestos/impuesto/@base"/>
                      </td>
                    </tr>
                    <tr>        
                        <td colspan="4">
                            <span class="negrita">Total con impuestos: </span>
                            <xsl:value-of select="factura/impuestos/impuesto/@base 
                                + factura/impuestos/impuesto"/>
                      </td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
