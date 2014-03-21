stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN	Transmitter

Name	adsb_out6
<!-- STKv4.0 Format="XML" -->
<STKOBJECT>
<OBJECT Class = "CommRadarObject" Name = "STK_Transmitter_Object">
    <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
    <OBJECT Class = "string" Name = "Description"> &quot;STK Transmitter Object&quot; </OBJECT>
    <OBJECT Class = "link" Name = "Model">
        <OBJECT Class = "Transmitter" Name = "Simple_Transmitter_Model">
            <OBJECT Class = "string" Name = "Category"> &quot;&quot; </OBJECT>
            <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
            <OBJECT Class = "double" Name = "DataRate"> 1000000 b*sec^-1 </OBJECT>
            <OBJECT Class = "string" Name = "Description"> &quot;Simple model of a transmitter&quot; </OBJECT>
            <OBJECT Class = "double" Name = "EIRP"> 249.9999950079738 W </OBJECT>
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
            <OBJECT Class = "double" Name = "Frequency"> 1090000000 Hz </OBJECT>
            <OBJECT Class = "link" Name = "Modulator">
                <OBJECT Class = "Modulator" Name = "Pulsed_Signal">
                    <OBJECT Class = "bool" Name = "AutoScaleBandwidth"> False </OBJECT>
                    <OBJECT Class = "double" Name = "Bandwidth"> 8000000 Hz </OBJECT>
                    <OBJECT Class = "string" Name = "Category"> &quot;@Top&quot; </OBJECT>
                    <OBJECT Class = "int" Name = "ChipsPerBit"> 1 </OBJECT>
                    <OBJECT Class = "bool" Name = "Clonable"> True </OBJECT>
                    <OBJECT Class = "string" Name = "Description"> &quot;Modulator which creates a pulsed signal&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "LowerBandwidthLimit"> -4000000 Hz </OBJECT>
                    <OBJECT Class = "int" Name = "NumberOfPulses"> 112 </OBJECT>
                    <OBJECT Class = "int" Name = "NumPSDNulls"> 15 </OBJECT>
                    <OBJECT Class = "double" Name = "PulsePeriod"> 1e-006 sec </OBJECT>
                    <OBJECT Class = "double" Name = "PulseWidth"> 5e-007 sec </OBJECT>
                    <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
                    <OBJECT Class = "bool" Name = "SymmetricBandwidth"> True </OBJECT>
                    <OBJECT Class = "string" Name = "Type"> &quot;Pulsed Signal&quot; </OBJECT>
                    <OBJECT Class = "double" Name = "UpperBandwidthLimit"> 4000000 Hz </OBJECT>
                    <OBJECT Class = "bool" Name = "UseCDMASpread"> False </OBJECT>
                    <OBJECT Class = "string" Name = "UserComment"> &quot;Modulator which creates a pulsed signal&quot; </OBJECT>
                    <OBJECT Class = "bool" Name = "UseSignalPSD"> False </OBJECT>
                    <OBJECT Class = "string" Name = "Version"> &quot;1.0.1 a&quot; </OBJECT>
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
            <OBJECT Class = "AttrCon" Name = "PostTransmitGainsLosses">
                <OBJECT Class = "container" Name = "GainLossList" />
            </OBJECT>
            <OBJECT Class = "bool" Name = "ReadOnly"> False </OBJECT>
            <OBJECT Class = "string" Name = "Type"> &quot;Simple Transmitter Model&quot; </OBJECT>
            <OBJECT Class = "bool" Name = "UseFilter"> False </OBJECT>
            <OBJECT Class = "bool" Name = "UsePolarization"> False </OBJECT>
            <OBJECT Class = "string" Name = "UserComment"> &quot;Simple model of a transmitter&quot; </OBJECT>
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
