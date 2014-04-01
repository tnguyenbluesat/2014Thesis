stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN	Transmitter

Name	Cubesat_ADSB_5W5_retrans
<!-- STKv4.0 Format="XML" -->
<STKOBJECT>
<OBJECT Class = "CommRadarObject" Name = "STK_Transmitter_Object">
    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
    <OBJECT Class = "string" Name = "Description"> &quot;STK Transmitter Object&quot; </OBJECT>
    <OBJECT Class = "link" Name = "Model">
        <OBJECT Class = "Transmitter" Name = "Complex_Re-Transmitter_Model">
            <OBJECT Class = "AttrCon" Name = "AntennaControl">
                <OBJECT Class = "string" Name = "AntennaReferenceType"> &quot;Embed&quot; </OBJECT>
                <OBJECT Class = "link" Name = "Antenna">
                    <OBJECT Class = "Antenna" Name = "Gaussian">
                        <OBJECT Class = "double" Name = "BacklobeGain"> 0.001 units </OBJECT>
                        <OBJECT Class = "double" Name = "Beamwidth"> 0.0278786253725679 rad </OBJECT>
                        <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
                        <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                        <OBJECT Class = "string" Name = "Description"> &quot;Analytical model of a Gaussian beam similar to a parabolic antenna within about -6 dB relative to boresight&quot; </OBJECT>
                        <OBJECT Class = "double" Name = "DesignFrequency"> 14500000000 Hz </OBJECT>
                        <OBJECT Class = "double" Name = "Diameter"> 1 m </OBJECT>
                        <OBJECT Class = "double" Name = "Efficiency"> 0.55 unitValue </OBJECT>
                        <OBJECT Class = "string" Name = "InputType"> &quot;Use Diameter&quot; </OBJECT>
                        <OBJECT Class = "double" Name = "MainlobeGain"> 12698.63479991337 units </OBJECT>
                        <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                        <OBJECT Class = "string" Name = "Type"> &quot;Gaussian&quot; </OBJECT>
                        <OBJECT Class = "bool" Name = "UseAsMainlobeAttenuation"> False </OBJECT>
                        <OBJECT Class = "string" Name = "UserComment"> &quot;Analytical model of a Gaussian beam similar to a parabolic antenna within about -6 dB relative to boresight&quot; </OBJECT>
                        <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
                    </OBJECT>
                </OBJECT>
                <OBJECT Class = "link" Name = "Orientation">
                    <OBJECT Class = "Orientation" Name = "Azimuth Elevation">
                        <OBJECT Class = "string" Name = "AboutBoresight"> &quot;Rotate&quot; </OBJECT>
                        <OBJECT Class = "double" Name = "AzimuthAngle"> 0 rad </OBJECT>
                        <OBJECT Class = "double" Name = "ElevationAngle"> 1.570796326794897 rad </OBJECT>
                        <OBJECT Class = "string" Name = "Type"> &quot;Azimuth Elevation&quot; </OBJECT>
                        <OBJECT Class = "double" Name = "XPositionOffset"> 0 m </OBJECT>
                        <OBJECT Class = "double" Name = "YPositionOffset"> 0 m </OBJECT>
                        <OBJECT Class = "double" Name = "ZPositionOffset"> 0 m </OBJECT>
                    </OBJECT>
                </OBJECT>
                <OBJECT Class = "link" Name = "Polarization">
                    <OBJECT Class = "Polarization" Name = "Linear">
                        <OBJECT Class = "double" Name = "CrossPolLeakage"> 1e-006 units </OBJECT>
                        <OBJECT Class = "string" Name = "ReferenceAxis"> &quot;X Axis&quot; </OBJECT>
                        <OBJECT Class = "double" Name = "TiltAngle"> 0 rad </OBJECT>
                        <OBJECT Class = "string" Name = "Type"> &quot;Linear&quot; </OBJECT>
                    </OBJECT>
                </OBJECT>
                <OBJECT Class = "bool" Name = "UsePolarization"> False </OBJECT>
            </OBJECT>
            <OBJECT Class = "string" Name = "Category"> &quot;@Top&quot; </OBJECT>
            <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
            <OBJECT Class = "bool" Name = "COverImLinearScale"> False </OBJECT>
            <OBJECT Class = "container" Name = "COverImPolynomial">
                <OBJECT>
                    <OBJECT Class = "double" Name = "Coefficient"> 0 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 0 </OBJECT>
                </OBJECT>
                <OBJECT>
                    <OBJECT Class = "double" Name = "Coefficient"> 1 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 1 </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "container" Name = "COverImTableData">
                <OBJECT>
                    <OBJECT Class = "double" Name = "COverIm"> 0 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 0 </OBJECT>
                    <OBJECT Class = "double" Name = "InputBackOff"> 0 &quot;&quot; </OBJECT>
                </OBJECT>
                <OBJECT>
                    <OBJECT Class = "double" Name = "COverIm"> 1 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 1 </OBJECT>
                    <OBJECT Class = "double" Name = "InputBackOff"> 1 &quot;&quot; </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "string" Name = "COverImTransferFunctionType"> &quot;Polynomial&quot; </OBJECT>
            <OBJECT Class = "string" Name = "Description"> &quot;Complex model of a re-transmitter&quot; </OBJECT>
            <OBJECT Class = "link" Name = "Filter">
                <OBJECT Class = "Filter" Name = "Butterworth">
                    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                    <OBJECT Class = "double" Name = "CutoffFrequency"> 10000000 Hz </OBJECT>
                    <OBJECT Class = "string" Name = "Description"> &quot;General form of nth order Butterworth filter with flat passband and stopband regions&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "InsertionLoss"> 1 units </OBJECT>
                    <OBJECT Class = "double" Name = "LowerBandwidthLimit"> -20000000 Hz </OBJECT>
                    <OBJECT Class = "int" Name = "Order"> 4 </OBJECT>
                    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                    <OBJECT Class = "string" Name = "Type"> &quot;Butterworth&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "UpperBandwidthLimit"> 20000000 Hz </OBJECT>
                    <OBJECT Class = "string" Name = "UserComment"> &quot;General form of nth order Butterworth filter with flat passband and stopband regions&quot; </OBJECT>
                    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "container" Name = "FrequencyPolynomial">
                <OBJECT>
                    <OBJECT Class = "double" Name = "Coefficient"> -700000000 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 0 </OBJECT>
                </OBJECT>
                <OBJECT>
                    <OBJECT Class = "double" Name = "Coefficient"> 1 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 1 </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "string" Name = "OperationalMode"> &quot;Use unadjusted receive flux density&quot; </OBJECT>
            <OBJECT Class = "AttrCon" Name = "PostTransmitGainsLosses">
                <OBJECT Class = "container" Name = "GainLossList" />
            </OBJECT>
            <OBJECT Class = "bool" Name = "PowerBackOffLinearScale"> False </OBJECT>
            <OBJECT Class = "container" Name = "PowerBackOffPolynomial">
                <OBJECT>
                    <OBJECT Class = "double" Name = "Coefficient"> 0 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 0 </OBJECT>
                </OBJECT>
                <OBJECT>
                    <OBJECT Class = "double" Name = "Coefficient"> 1 &quot;&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 1 </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "container" Name = "PowerBackOffTableData">
                <OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 0 </OBJECT>
                    <OBJECT Class = "double" Name = "InputBackOff"> 0 &quot;&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "OutputBackOff"> 0 &quot;&quot; </OBJECT>
                </OBJECT>
                <OBJECT>
                    <OBJECT Class = "int" Name = "Index"> 1 </OBJECT>
                    <OBJECT Class = "double" Name = "InputBackOff"> 1 &quot;&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "OutputBackOff"> 1 &quot;&quot; </OBJECT>
                </OBJECT>
            </OBJECT>
            <OBJECT Class = "string" Name = "PowerBackOffTransferFunctionType"> &quot;Polynomial&quot; </OBJECT>
            <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
            <OBJECT Class = "double" Name = "SaturatedFluxDensity"> 1e-009 W*m^-2 </OBJECT>
            <OBJECT Class = "double" Name = "SaturatedPower"> 5.500003932313995 W </OBJECT>
            <OBJECT Class = "string" Name = "Type"> &quot;Complex Re-Transmitter Model&quot; </OBJECT>
            <OBJECT Class = "bool" Name = "UseCOverIm"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UseFilter"> False </OBJECT>
            <OBJECT Class = "string" Name = "UserComment"> &quot;Complex model of a re-transmitter&quot; </OBJECT>
            <OBJECT Class = "string" Name = "Version"> &quot;1.0.1 a&quot; </OBJECT>
        </OBJECT>
    </OBJECT>
    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
    <OBJECT Class = "string" Name = "Type"> &quot;STK Transmitter Object&quot; </OBJECT>
    <OBJECT Class = "string" Name = "UserComment"> &quot;STK Transmitter Object&quot; </OBJECT>
    <OBJECT Class = "string" Name = "Version"> &quot;1.0.0 a&quot; </OBJECT>
</OBJECT>
</STKOBJECT>

END	Transmitter

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Graphics

	ShowGfx           Off
	Relative          Off
	ShowBoresight     On
	BoresightMarker   4
	BoresightColor    #ffffff

END Graphics
    END Graphics
    
    BEGIN ContourGfx
	ShowContours      Off
    END ContourGfx
    
    BEGIN ExternData
    END ExternData
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN AccessConstraints
		LineOfSight   IncludeIntervals 
    END AccessConstraints
    
    BEGIN ObjectCoverage
    END ObjectCoverage
    
    BEGIN Desc
    END Desc
    
    BEGIN Refraction
		RefractionModel	Effective Radius Method

		UseRefractionInAccess		No

		BEGIN ModelData
			RefractionCeiling	5.00000000000000e+003
			MaxTargetAltitude	1.00000000000000e+004
			EffectiveRadius		1.33333333333333e+000

			UseExtrapolation	 Yes


		END ModelData
    END Refraction
    
    BEGIN Contours
	ActiveContourType Antenna Gain

	BEGIN ContourSet Antenna Gain
		Altitude          0.000000e+000
		ShowAtAltitude    Off
		Projected         On
		Relative          On
		ShowLabels        Off
		LineWidth         1.000000
		DecimalDigits     1
		ColorRamp         On
		ColorRampStartColor   #ff0000
		ColorRampEndColor     #0000ff
		BEGIN ContourDefinition
		BEGIN CntrAntAzEl
			BEGIN AzElPattern
				BEGIN AzElPatternDef
					SetResolutionTogether 0
					CoordinateSystem 0
					NumAzPoints      50
					AzimuthRes       7.346939
					MinAzimuth       -180.000000
					MaxAzimuth       180.000000
					NumElPoints      50
					ElevationRes     1.836735
					MinElevation     0.000000
					MaxElevation     90.000000
				END AzElPatternDef
			END AzElPattern
		END CntrAntAzEl
		END ContourDefinition
	END ContourSet

	BEGIN ContourSet EIRP
		Altitude          0.000000e+000
		ShowAtAltitude    Off
		Projected         On
		Relative          On
		ShowLabels        Off
		LineWidth         1.000000
		DecimalDigits     1
		ColorRamp         On
		ColorRampStartColor   #ff0000
		ColorRampEndColor     #0000ff
		BEGIN ContourDefinition
		BEGIN CntrAntAzEl
			BEGIN AzElPattern
				BEGIN AzElPatternDef
					SetResolutionTogether 0
					CoordinateSystem 0
					NumAzPoints      50
					AzimuthRes       0.000000
					MinAzimuth       -180.000000
					MaxAzimuth       180.000000
					NumElPoints      50
					ElevationRes     0.000000
					MinElevation     0.000000
					MaxElevation     90.000000
				END AzElPatternDef
			END AzElPattern
		END CntrAntAzEl
		END ContourDefinition
	END ContourSet

	BEGIN ContourSet Flux Density
		Altitude          0.000000e+000
		ShowAtAltitude    Off
		Projected         On
		Relative          On
		ShowLabels        Off
		LineWidth         1.000000
		DecimalDigits     1
		ColorRamp         On
		ColorRampStartColor   #ff0000
		ColorRampEndColor     #0000ff
		BEGIN ContourDefinition
		BEGIN CntrAntLatLon
			SetResolutionTogether   true
			Resolution	9.000000  9.000000
			ElevationAngleConstraint	90.000000
			BEGIN LatLonSphGrid
				Centroid	0.000000	0.000000
				ConeAngle	0.000000
				NumPts		50	20
				Altitude	0.000000
			END LatLonSphGrid
		END CntrAntLatLon
		END ContourDefinition
	END ContourSet

	BEGIN ContourSet RIP
		Altitude          0.000000e+000
		ShowAtAltitude    Off
		Projected         On
		Relative          On
		ShowLabels        Off
		LineWidth         1.000000
		DecimalDigits     1
		ColorRamp         On
		ColorRampStartColor   #ff0000
		ColorRampEndColor     #0000ff
		BEGIN ContourDefinition
		BEGIN CntrAntLatLon
			SetResolutionTogether   true
			Resolution	9.000000  9.000000
			ElevationAngleConstraint	90.000000
			BEGIN LatLonSphGrid
				Centroid	0.000000	0.000000
				ConeAngle	0.000000
				NumPts		50	20
				Altitude	0.000000
			END LatLonSphGrid
		END CntrAntLatLon
		END ContourDefinition
	END ContourSet
    END Contours
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO
    
    BEGIN 3dVolume
	ActiveVolumeType  Antenna Beam

	BEGIN VolumeSet Antenna Beam
	Scale 200000.000000
	NumericGainOffset 1.000000
	Frequency 14500000000.000000
	ShowAsWireframe 0
				BEGIN AzElPatternDef
					SetResolutionTogether 0
					CoordinateSystem 0
					NumAzPoints      50
					AzimuthRes       7.346939
					MinAzimuth       -180.000000
					MaxAzimuth       180.000000
					NumElPoints      50
					ElevationRes     1.836735
					MinElevation     0.000000
					MaxElevation     90.000000
				END AzElPatternDef
	END VolumeSet
Begin VolumeGraphics
	ShowContours    No
	ShowVolume No
End VolumeGraphics
    END 3dVolume

END Extensions
