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
                    <h1>Pedidos</h1>          
                </header>      
                        
                <br/>
                
                <table>
                    <tr>
                        <td class="negrita">Peso</td>                        
                        <td class="negrita">RAM</td>     
                        <td class="negrita">Disco</td>             
                        <td class="negrita">Precio</td>  
                    </tr>
                    
                    <xsl:for-each select="pedido/portatiles/portatil">
                        <tr>
                            <td>
                                <xsl:value-of select="peso"/>                             
                            </td>                             
                            <td> 
                                <xsl:value-of select="ram"/>   
                            </td>
                            <td>
                                <xsl:value-of select="disco"/> 
                            </td>
                            <td>
                                <xsl:value-of select="precio"/> 
                            </td>
                        </tr>
                    </xsl:for-each>                                             
                </table>
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>