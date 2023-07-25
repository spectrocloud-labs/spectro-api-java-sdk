# V1GPUDeviceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **Map&lt;String, String&gt;** | Addresses is a map of PCI device entry name to its addresses. Example entry would be \&quot;11:00.0 VGA compatible controller [0300]: NVIDIA Corporation Device [10de:1eb1] (rev a1)\&quot;- &gt; 0000_11_00_0\&quot; The address is BDF (Bus Device Function) identifier format seperated by underscores. The first 4 bits are almost always 0000. In the above example 11 is Bus, 00 is Device,0 is function. The values of these addreses are expected in hexadecimal format  |  [optional]
**model** | **String** | Model is the model of GPU, for a given vendor, for eg., TU104GL [Tesla T4] |  [optional]
**vendor** | **String** | Vendor is the GPU vendor, for eg., NVIDIA or AMD |  [optional]
